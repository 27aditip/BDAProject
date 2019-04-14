
import { TransService } from './transaction/transaction.service';
import { TransComponent } from './transaction/transaction.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import{ HttpModule } from '@angular/http';


@NgModule({
  declarations: [
    AppComponent,TransComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,HttpModule,FormsModule
  ],
  providers: [TransService],
  bootstrap: [AppComponent]
})
export class AppModule { }
