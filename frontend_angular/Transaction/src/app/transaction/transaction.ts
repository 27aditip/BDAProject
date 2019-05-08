export class transaction{
 
    transactionId:String ;
	userID:String ;
    transactionType:String ;
    fromAC:number;
    fromBankIFSC:String ;
    toAC: number;
    toBankIFSC: String;
    currency:String;
    transactionAmount:number;
    transactionLocation:String;
    isFraud:String;
    fraudHandlerUserID:String;
    comments:String;

}