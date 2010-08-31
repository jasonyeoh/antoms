'''
Created on Aug 21, 2010

@author: Yogendra Rampuria
'''
import os

from google.appengine.ext.webapp import template


def get_template(src_file,name):
    return os.path.join(os.path.dirname(src_file),name)

def render_template_by_name(src_file, template_name, template_values):
    template.render(get_template(src_file, template_name), template_values)

def render_template_by_name_to_out(src_file, template_name, template_values, out):
    out.write(render_template_by_name(src_file, template_name, template_values))