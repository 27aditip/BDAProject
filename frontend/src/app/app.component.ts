import { Component } from '@angular/core';
import { Http, Headers } from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Welcome To Amruta Patil';
  private headers = new Headers({ 'Content-Type': 'application/json'});

  constructor( private http: Http ) {}

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


}
