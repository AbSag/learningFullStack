import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Applicant } from './applicant/applicant';

@Injectable({
  providedIn: 'root'
})
export class ApplicantService {

  applicant: Applicant =new Applicant();

  constructor(private myHttp: HttpClient) { }

  loadAllApplicantService() : Observable<Applicant[]>{
    console.log('loadAllApplicantService() invoked....')
    return this.myHttp.get<Applicant[]>("http://localhost:8080/appDetails/")
  }

  addSingleApplicantService(applicant: Applicant):Observable<string>{
    console.log('addSingleApplicantService() is invoked....');
    return this.myHttp.post<string>("http://localhost:8080/appDetails/addApplicant", applicant, { responseType: "text" as 'json' });
  }

  sendEmailService(email: string):Observable<string>{
    console.log('sendEmailService() is invoked....')
    return this.myHttp.get<string>("http://localhost:8080/mail/appDetails/send/" + this.applicant.emailId , { responseType:'text' as 'json'}); 
  }

}
