$( document ).ready(function() {
    console.log( "ready!" );
    $('#personsTable tr').each(function() {
        var errorCell = $(this).find(".errorCell").html();
        if(errorCell=="true"){
        	$(this).css("background-color", "#FF0000");
        }
        console.log(errorCell);
     });
    
    $( "#saveData" ).click(function() { start(); });
    
  
});

function start() {
 	 $.ajax({
 		   type:'POST',
 		   url :"savePersons",
 		   success: function() {
 		        console.log('success');
 		       alert('Data successfully saved');
 		   },
 		   error:function(exception){alert('Exeption:'+exception);}
 		}); 
 }