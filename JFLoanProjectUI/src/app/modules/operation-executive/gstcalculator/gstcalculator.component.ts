import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gstcalculator',
  templateUrl: './gstcalculator.component.html',
  styleUrls: ['./gstcalculator.component.scss']
})
export class GstcalculatorComponent implements OnInit {

  loanamount:Number ;
  buyyerstate:Number;
  sellerstate:Number

  columnnames:Array<any>
  data:Array<any>

  constructor() { }

  ngOnInit() {
  }

  calculategst=(loanamount,buyyerstate,sellerstate)=>{

  var parent=this
    var request=new XMLHttpRequest();
	request.open("GET","http://localhost:8085/setGST/"+sellerstate+"/"+buyyerstate+"/"+loanamount,true)
	request.send();
	request.onreadystatechange=function()
	{
		if(request.readyState==4 && request.status==200)
			{
      var data= JSON.parse(request.responseText)
      console.log(data)
       parent.columnnames= Object.keys(data)
       parent.data=data

			}
	}
}
}
