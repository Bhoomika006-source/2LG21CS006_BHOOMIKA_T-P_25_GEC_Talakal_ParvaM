from django.shortcuts import render
from .models import student;

def student_listO(request);
    student=student.objects.all()
    return render(request,'student/student_list.html',{students})

# Create your views here.
def student_form(request):
    if request.method=='POST':
        sname=request.POST['sname']
        sclass=request.POST['sclass']
        ssection=request.POST['ssection']
        sgender=request.POST['sgender']
        sdob=request.POST['sdob']
        
        
       
        student.objects.create(sname=sname,
        sclass=sclass,ssection=ssection,
        sgender=sgender,sdob=sdob)
    return render(request, 'students/student_form.html')

def student_delete(request):
    if request.method=='POST':
        sname=request.POST['sname']
        sclass=request.POST['sclass']
        ssection=request.POST['ssection']
        sgender=request.POST['sgender']
        sdob=request.POST['sdob']
        
        
       
        student.objects.create(sname=sname,
        sclass=sclass,ssection=ssection,
        sgender=sgender,sdob=sdob)
    return render(request, 'students/student_form.html')

def student_update(request,id):
    student =student.objects.get(id=id)
    if request.method=='POST':
        sname=request.POST['sname']
        sclass=request.POST['sclass']
        ssection=request.POST['ssection']
        sgender=request.POST['sgender']
        sdob=request.POST['sdob']
        student.save()
        return redirect ('student_list')
        

    return render(request, 'students/student_form.html',{'student':student})