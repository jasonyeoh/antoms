'''
Created on Aug 30, 2010

@author: Yogendra Rampuria
'''
from google.appengine.ext import db

class AuthToken(db.Model):
    user=db.UserProperty(verbose_name="User")
    token=db.StringProperty(verbose_name="Authentication Token", multiline="false")
    service=db.StringProperty(verbose_name="Service Name", multiline="false")
    enabled=db.BooleanProperty(verbose_name="Account Active")
    date = db.DateTimeProperty(auto_now_add=True)


    