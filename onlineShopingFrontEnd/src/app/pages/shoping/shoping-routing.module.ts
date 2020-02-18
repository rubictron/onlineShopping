import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ShopingModule } from './shoping.module';
import { ShopComponent } from './shop/shop.component';
import { ShopingComponent } from './shoping.component';
import { NewShopComponent } from './shop/new-shop/new-shop.component';
import { PhoneProductComponent } from './phone-product/phone-product.component';
import { HomeComponent } from './home/home.component';
import { ShopByIdComponent } from './shop-by-id/shop-by-id.component';

const routes: Routes = [{
  path: '',
  component: ShopingComponent,
  children: [
    {
      path: 'shop',
      component: ShopComponent,
    },
    {
      path: 'addShop',
      component: NewShopComponent,
    },
    {
      path: 'phoneProducts',
      component: PhoneProductComponent,
    },
    {
      path: 'home',
      component: HomeComponent,
    },
    {
      path: 'shopById/:id',
      component: ShopByIdComponent,
    },

  ],
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ShopingRoutingModule { }
