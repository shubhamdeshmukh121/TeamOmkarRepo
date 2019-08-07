import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emicalculator',
  templateUrl: './emicalculator.component.html',
  styleUrls: ['./emicalculator.component.scss']
})
export class EmicalculatorComponent implements OnInit {

  principle:Number ;
  interest:Number;
  tenure:Number

  columnnames:Array<any>
  columndata:Array<any>

  constructor() { }

  ngOnInit() {
  }

  calculateAmortization=(principle,interest,tenure)=>{

  var parent=this
    var request=new XMLHttpRequest();
	request.open("GET","http://localhost:8083/AmortizationSchedule/"+principle+"/"+interest+"/"+tenure,true)
	request.send();
	request.onreadystatechange=function()
	{
		if(request.readyState==4 && request.status==200)
			{
      var data= JSON.parse(request.responseText)
       parent.columnnames= Object.keys(data[0])
       parent.columndata=data

			}
	}
  }

}
