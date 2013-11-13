<html>
	<head>
		<script type="text/javascript" src="js/jquery.js"></script> 		
                <script>
                    function enviar(){ 
//                        alert("Enviado")
                        $.ajax({
                            url:"http://localhost:8080/DocKoghi/webresources/ambiente/",
                            type: 'post',
                            data : {descripcionAmbiente:"Prueba"},
                            corssDomain : true,
                            contentType: "application/xml",
//                            Accept : "application/xml",
//                            dataType: 'xml'
//                            headers : {Accept : "application/json","Access-Control-Allow-Origin" : "*"}
                        }).done(function(msg){
                            alert("Mensaje: " + msg);
                        })
                    }
                </script>
        </head>
<body>
    
        
        <input type="text" id="descripcionAmbiente" value="" name="descripcionAmbiente" />
        <button onclick='enviar()'>Enviar</button>
        
    
</body>
</html>