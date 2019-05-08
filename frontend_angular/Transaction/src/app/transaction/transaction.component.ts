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
    this.Transaction.transactionId=null;
    this.Transaction.userID=null;
    this.Transaction.fromAC=null;
    this.Transaction.fromBankIFSC=null;
    this.Transaction.toAC=null;
    this.Transaction.toBankIFSC=null;
    this.Transaction.currency=null;
    this.Transaction.transactionAmount=null;
    this.Transaction.transactionLocation=null;
    this.Transaction.isFraud=null;
    this.Transaction.fraudHandlerUserID=null;
    this.Transaction.comments=null;

}




}



