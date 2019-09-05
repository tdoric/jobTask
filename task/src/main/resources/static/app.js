$( document ).ready(function() {
    console.log( "ready!" );
    $('#personsTable tr').each(function() {
        var errorCell = $(this).find(".errorCell").html();
        if(errorCell=="true"){
        	$(this).css("background-color", "#FF0000");
        }
        console.log(errorCell);
     });
});