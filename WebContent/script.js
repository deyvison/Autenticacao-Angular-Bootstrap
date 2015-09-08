var app = angular.module("Myapp", []);

app.controller('autenticacao',function autenticacao($scope,$http){

	$scope.enviarDados = function(){
		var jsonObj = {"Login": $scope.login, "Senha": $scope.senha}
		$http.post("", jsonObj);
	}
	
	
});

