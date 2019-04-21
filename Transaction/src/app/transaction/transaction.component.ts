import { TransService } from './transaction.service';
import { Component , OnInit } from '@angular/core';

import { transaction} from './transaction';


@Component({
    selector: 'app-transaction',
    templateUrl: './transaction.component.html',
    styleUrls: ['./transaction.component.css']
})
export class TransComponent implements OnInit{
    trans: transaction[];
    Transaction = new  transaction();
    constructor(private _Transactionervice : TransService){}

    ngOnInit(): void{
        
    }

   

    addTransaction(): void{
        this._Transactionervice.addTransaction(this.Transaction)
        .subscribe((response) => {
            console.log(response);
            this.reset();
            
        
        },(error) => {
            console.log(error);
        });
    }

    private reset(){
    this.Transaction.Id=null;
    this.Transaction.userID=null;
    this.Transaction.fromAccountNo=null;
    this.Transaction.fromIFSC=null;
    this.Transaction.toAccountNo=null;
    this.Transaction.toIFSC=null;
    this.Transaction.currency=null;
    this.Transaction.amount=null;
    this.Transaction.transactionLocation=null;
    this.Transaction.isFraud=null;
    this.Transaction.fraudHandlerUserID=null;
    this.Transaction.comments=null;

}




}



