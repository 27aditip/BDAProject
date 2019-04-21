angular.module("fraudApp").controller("GeneralController",GeneralController);

GeneralController.inject=['$scope','Transaction'];

function GeneralController($scope,Transaction){
	$scope.transactions=Transaction.query();
	$scope.transaction={};
	$scope.buttonText="Submit";
	
	$scope.saveTransaction=function(){
		
		if($scope.transaction.id!==undefined){
			Transaction.update($scope,transaction,function(){
				$scope.transactions=Transaction.query();
				$scope.transaction={};
				$scope.buttonText="Submit";
			});
		}else{
			Transaction.save($scope,transaction,function(){
				$scope.transactions=Transaction.query();
				$scope.Transaction={};
			});
		}
	}
	
	$scope.updateTransactionInit=function(transaction){
		$scope.buttonText="Update";
		$scope.transaction=transaction;
	}
	
	$scope.deleteTransaction=function(transaction){
		transaction.$delete({id:transaction.id},function(){
			$scope.transactions=Transaction.query();
		})
	}
	
}