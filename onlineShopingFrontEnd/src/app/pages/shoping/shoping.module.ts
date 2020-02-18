import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
  NbActionsModule,
  NbButtonModule,
  NbCardModule,
  NbTabsetModule,
  NbUserModule,
  NbRadioModule,
  NbSelectModule,
  NbListModule,
  NbIconModule,
  NbInputModule,

} from '@nebular/theme';

import { ShopingRoutingModule } from './shoping-routing.module';
import { ShopingComponent } from './shoping.component';
import { ShopComponent } from './shop/shop.component';
import { FormsModule as ngFormsModule } from '@angular/forms';
import { NewShopComponent } from './shop/new-shop/new-shop.component';
import { HomeComponent } from './home/home.component';
import { PhoneProductComponent } from './phone-product/phone-product.component';
import { ShopByIdComponent } from './shop-by-id/shop-by-id.component';

@NgModule({
  declarations: [
    ShopingComponent,
    ShopComponent,
    NewShopComponent,
    HomeComponent,
    PhoneProductComponent,
    ShopByIdComponent],
  imports: [
    NbInputModule,
    NbCardModule,
    NbUserModule,
    NbButtonModule,
    NbTabsetModule,
    NbActionsModule,
    NbRadioModule,
    NbSelectModule,
    NbListModule,
    NbIconModule,
    NbButtonModule,
    NbCardModule,
    CommonModule,
    ShopingRoutingModule,
    ngFormsModule
  ]
})
export class ShopingModule { }
