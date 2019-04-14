import { Component, OnInit, ViewChild } from '@angular/core';
import { Http, Headers } from '@angular/http';

@Component({
  selector: 'app-transaction-page',
  templateUrl: './transaction-page.component.html',
  styleUrls: ['./transaction-page.component.css']
})
export class TransactionPageComponent implements OnInit {

  ch = '';
  channels = [];

  private headers = new Headers({ 'Content-Type': 'application/json'});

  constructor( private http: Http ) {}

  validate = () => {
    console.log(this.ch);
  }

  // Add Transaction
  addNewTransaction = (transData) => {
    let body = JSON.stringify(transData);
    
    this.http.post("http://localhost:8080/api/add" , body ,  {headers : this.headers} )
    .subscribe( res=> {
        console.log(res);
      },
      err=> {
        console.log(err);
      })
  }

  ngOnInit() {

      this.channels = ['RTGS','NEFT','UPI','Online Banking','Swiping Machine', 'Branch','ATM','Card'];

  }
}
