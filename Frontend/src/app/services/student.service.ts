import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ResponseGeneric } from '../models/responseGeneric.model';

const baseUrl = 'http://localhost:8080/api/v1/students';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<ResponseGeneric> {
    return this.http.get<ResponseGeneric>(baseUrl);
  }

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }


}