from django.db import models


# Create your models here.
class student(models.Model):
    sname = models.CharField(max_length=100)
    sclass = models.CharField(max_length=10)
    ssection = models.CharField(max_length=10)
    sgender = models.CharField(max_length=10)
    sdob = models.DateField()