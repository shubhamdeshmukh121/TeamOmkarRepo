import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-defaulter',
  templateUrl: './defaulter.component.html',
  styleUrls: ['./defaulter.component.scss']
})
export class DefaulterComponent implements OnInit {

columnnames:Array<any>;
columndata:Array<any>;

  constructor() { }

  ngOnInit() {

var parent=this
    var request=new XMLHttpRequest();
	request.open("GET","http://localhost:8083/defaulters/get",true)
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


   takeaction=(defaulterdata:any)=>{
    var parent=this
    var request=new XMLHttpRequest();
  request.open("POST","http://localhost:8083/legal/add",true)
  request.setRequestHeader("Content-type","application/json")

  request.send(JSON.stringify(defaulterdata));
  
	request.onreadystatechange=function()
	{
		if(request.readyState==4 && request.status==200)
			{

        alert("data saved")
      }
	}



   }

}
