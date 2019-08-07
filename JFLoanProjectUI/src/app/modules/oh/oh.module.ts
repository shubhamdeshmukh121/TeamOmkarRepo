import { NgModule, Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OhdashboardComponent } from './ohdashboard/ohdashboard.component';
import { AgentdetailsComponent } from './agentdetails/agentdetails.component';
import { Routes, RouterModule } from '@angular/router';
import { componentFactoryName } from '@angular/compiler';

const ohrouting:Routes=[{path:'ohdashboard',component:OhdashboardComponent},
<<<<<<< Updated upstream
{path:'agentdetails',component:AgentdetailsComponent}]
=======
{path:'agentdetails',component:AgentdetailsComponent},
]
>>>>>>> Stashed changes

@NgModule({
  declarations: [OhdashboardComponent, AgentdetailsComponent],
  exports:[OhdashboardComponent, AgentdetailsComponent],
  imports: [
    RouterModule.forChild(ohrouting),
    CommonModule
  ]
})
export class OhModule { }
