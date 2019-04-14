angular.module("crudApp").controller("GeneralController",GeneralController);

GeneralController.inject=['$scope','CustomerTransaction'];

function GeneralController($scope,CustomerTransaction){
	$scope.customerTransactions=CustomerTransaction.query();
	$scope.customerTransaction={};
	$scope.buttonText="Submit";
	
	$scope.saveTransaction=function(){
		if($scope.customerTransaction.id!==undefined){
			CustomerTransaction.update($scope,customerTransaction,function(){
				$scope.customerTransacton=CustomerTransaction.query();
				$scope.customerTransaction={};
				$scope.buttonText="Submit";
			}); 
		}else{
			
		}
	}
}