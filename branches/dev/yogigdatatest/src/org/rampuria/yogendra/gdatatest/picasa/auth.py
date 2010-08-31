'''
Created on Aug 30, 2010

@author: Yogendra Rampuria
'''
from google.appengine.api import users
from google.appengine.ext import webapp, db
from org.rampuria.yogendra.gdatatest.data.GData import AuthToken
#from gdata.photos.service import PhotosService





def GetAuthSubUrl():
    next = 'http://localhost:7072/picasa/authback'
    scope = 'http://picasaweb.google.com/data/'
    secure = False
    session = True
    #gd_client = PhotosService()
    #return gd_client.GenerateAuthSubURL(next, scope, secure, session);


class PicasaAuthBack(webapp.RequestHandler):
    def get(self):
        t = AuthToken()
        t.name = users.get_current_user();
        t.service="picasa";
        t.token = self.request.get('token')
        t.save();
        self.response.out.write("Auth Received!!!!");
        
        
    
class PicasaAuth(webapp.RequestHandler):
    def get(self):
        self.request
        
        self.response.out.write("Picasa Auth")
        

