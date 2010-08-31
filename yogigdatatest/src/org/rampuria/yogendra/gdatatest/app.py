from google.appengine.ext import webapp
from google.appengine.api import users
from google.appengine.ext.webapp.util import run_wsgi_app
from org.rampuria.yogendra.gdatatest.login import LoginHandler, LogoutHandler
from org.rampuria.yogendra.gdatatest.picasa.auth import PicasaAuth, \
    PicasaAuthBack
from org.rampuria.yogendra.gdatatest.picasa.service import PicasaService
from google.appengine.ext.webapp import template
from org.rampuria.yogendra.gdatatest.utils import render_template_by_name_to_out

class MainPage(webapp.RequestHandler):
    def get(self):
        self.response.headers['Content-Type'] = 'text/plain'
        self.response.out.write('Hello, webapp World!')
        if users.get_current_user():
            auth_url = "/logout"
            auth_text = "Logout"
        else:
            auth_url = "/login"
            auth_text = "Login"
            
        template_values = {
                           'auth_url':auth_url,
                           'auth_text':auth_text
                           
                           }
        render_template_by_name_to_out(__file__, "app.html", template_values, self.response.out)
        

application = webapp.WSGIApplication(
                                     [
                                      ('/', MainPage),
                                      ('/login', LoginHandler),
                                      ('/logout', LogoutHandler),
                                      ('/picasa/auth', PicasaAuth),
                                      ('/picasa/authback', PicasaAuthBack),
                                      ('/picasa/service', PicasaService),                                      
                                      ], 
                                     debug=True)


def main():
    run_wsgi_app(application)

if __name__ == "__main__":
    main()
