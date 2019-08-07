import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OperationExecutivedashboardComponent } from './operation-executivedashboard/operation-executivedashboard.component';
import { RouterModule, Routes } from '@angular/router';

import { EmicalculatorComponent } from './emicalculator/emicalculator.component';
import { FormsModule } from '@angular/forms';
import { GstcalculatorComponent } from './gstcalculator/gstcalculator.component';
const oerouting:Routes=[{path:'operationexecutivedashboard',component:OperationExecutivedashboardComponent},
{path:'emicalculator',component:EmicalculatorComponent
},
{path:'gstcalculator',component:GstcalculatorComponent
}

]


@NgModule({
  declarations: [OperationExecutivedashboardComponent, EmicalculatorComponent, GstcalculatorComponent],
  exports:[OperationExecutivedashboardComponent ],
  imports: [
    RouterModule.forChild(oerouting),
    CommonModule,
    FormsModule
  ]
})
export class OperationExecutiveModule { }
