export class transaction{
 
    Id:String ;
	userID:String ;
    transactionType:String ;
    fromAccountNo:number;
    fromIFSC:String ;
    toAccountNo: number;
    toIFSC: String;
    currency:String;
    amount:number;
    transactionLocation:String;
    isFraud:String;
    fraudHandlerUserID:String;
    comments:String;

}