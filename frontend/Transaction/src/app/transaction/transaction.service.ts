import {Http, Response,RequestOptions,Headers} from '@angular/http' 
import { Injectable} from '@angular/core'; 
import { Observable } from 'rxjs';
import {  transaction} from './transaction';





@Injectable()
export class TransService{
   
    constructor(private _httpService: Http){}
    
private handleError(error: Response){
    return Observable.throw(error);
}



addTransaction(transaction: transaction){
    let body=JSON.stringify(transaction);
    let  headers =new Headers({'Content-Type': 'application/json'});
    let options= new RequestOptions({headers:headers});
    return this._httpService.post("http://localhost:8080/api/transactions",body,options);
}

}