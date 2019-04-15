angular.module('fraudApp').factory('Transaction',Transaction);

Transaction.$inject=['$resource'];

function Transaction($resource){
	var resourceUrl='api/transaction/:id';
	
	return $resource(resourseUrl,{},{
		'update':{
			method:'PUT'
		}
	});
}