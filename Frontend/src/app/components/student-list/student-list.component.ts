import { Component, OnInit } from '@angular/core';
import { ResponseGeneric } from 'src/app/models/responseGeneric.model';
import { Student } from 'src/app/models/student.model';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-tutorials-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  displayedColumns: string[] = ['id','name', 'Number phone', 'Age', 'Course'];

  dataSource: ResponseGeneric = new ResponseGeneric;
  currentStudent: Student = {};
  currentIndex = -1;
  title = '';

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.retrieveStudents();
  }

  retrieveStudents(): void {
    this.studentService.getAll()
      .subscribe({
        next: (data) => {
          this.dataSource = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

  

}