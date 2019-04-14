import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { NotFoundComponent } from "./components/not-found/not-found.component";
import { TransactionPageComponent } from "./components/transaction-page/transaction-page.component";
import { ReportingPageComponent } from "./components/reporting-page/reporting-page.component";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,
    TransactionPageComponent,
    ReportingPageComponent,
    NotFoundComponent 
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
      {path: '', component : NotFoundComponent},
      {path: 'reports', component:ReportingPageComponent},
      {path: 'transactions', component:TransactionPageComponent}
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
