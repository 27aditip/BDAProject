angular.module('crudApp').factory('CustomerTransaction',CustomerTransaction);
customerTransaction.$inject=['$resource'];

function CustomerTransaction($resource){
	
	var resourceUrl='api/customerTransaction/:id';
	return $resource(resourceUrl,{},{
		'Update':{
		method:'PUT'	
		}
	});
}