'''
Created on Aug 30, 2010

@author: Yogendra Rampuria
'''
from google.appengine.ext import webapp
from google.appengine.api import users

class LoginHandler(webapp.RequestHandler):
    def get(self):
        return self.process(self)
    
    def post(self):
        return self.process(self)
    
    def process(self):
        return self.redirect(users.create_login_url(dest_url=self.request.get("redirect"), _auth_domain=self.request.get("auth_domain")), False)
        
        
class LogoutHandler(webapp.RequestHandler):
    def get(self):
        return self.process(self)
    
    def post(self):
        return self.process(self)
    
    def process(self):
        return self.redirect(users.create_logout_url(dest_url=self.request.get("redirect"), _auth_domain=self.request.get("auth_domain")), False)
        