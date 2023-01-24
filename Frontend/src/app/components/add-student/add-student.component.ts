import { Component } from '@angular/core';
import { Student } from 'src/app/models/student.model';
import { StudentService } from 'src/app/services/student.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-tutorial',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent {

  student: Student = {
    name: '',
    numberPhone: '',
    age: 0,
    course: ''
  };


  submitted = false;

  constructor(private studentService: StudentService, private router: Router) { }

  saveStudent(): void {
    const data = {
      name: this.student.name,
      numberPhone: this.student.numberPhone,
      age: this.student.age,
      course: this.student.course,
    };

    this.studentService.create(data)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.submitted = true;
        },
        error: (e) => console.error(e)
      });

      
  }

  newStudent(): void {
    this.router.navigate(['students']);
  }

}