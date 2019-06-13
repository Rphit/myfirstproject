/**
 * 
 */

function validateForm()
{
    var form=document.getElementById("form1");
    var x=form["year"].value;
    if(x=="")
    	{
    	 alert("year field cant be empty ");
    	 return false;
    	}
	
	
}