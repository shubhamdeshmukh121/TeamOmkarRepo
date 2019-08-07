import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OperationHeaddashboardComponent } from './operation-headdashboard/operation-headdashboard.component';
import { RouterModule, Routes } from '@angular/router';

import { DefaulterComponent } from './defaulter/defaulter.component';

const ohrouting:Routes=[{path:'operationheaddashboard',component:OperationHeaddashboardComponent},
{path:'defaulter',component:DefaulterComponent}]




@NgModule({
  declarations: [OperationHeaddashboardComponent, DefaulterComponent],
  exports:[ OperationHeaddashboardComponent],
  
  imports: [
    RouterModule.forChild(ohrouting),
    CommonModule
  ]
})
export class OperationHeadModule { }
