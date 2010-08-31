'''
Created on Aug 30, 2010

@author: Yogendra Rampuria
'''
from google.appengine.ext import webapp
class PicasaService(webapp.RequestHandler):
    def get(self):
        self.response.out.write('Picasa Web App')
        
