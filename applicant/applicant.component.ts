import { Component, OnInit } from '@angular/core';
import { ApplicantService } from '../applicant.service';
import { Applicant } from './applicant';

@Component({
  selector: 'app-applicant',
  templateUrl: './applicant.component.html',
  styleUrls: ['./applicant.component.css']
})
export class ApplicantComponent implements OnInit {

  applObj: Applicant=new Applicant();

  appDetails: Applicant[]=[];

  constructor(private applicantService: ApplicantService) { }

  ngOnInit(): void {
  }

  message!: string;

  addApplicant(){
    this.applicantService.addSingleApplicantService(this.applObj).subscribe({
      next:(data:string) => {
        console.log('~next : applicant is added');
        this.appDetails.push(this.applObj);
        this.message=data;
        console.log('addAppl() is invoked..', this.message);
      },
      error:(err)=> {
        console.log('~~Error...');

        alert(err);
        this.message=err.error;
        console.log(err);
      },
      complete:()=> {
        console.log('~~~completed...');
      }
    });
  }

  sendEmail(){
    this.applicantService.sendEmailService
  }
}