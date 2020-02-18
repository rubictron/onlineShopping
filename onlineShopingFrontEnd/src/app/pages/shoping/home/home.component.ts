import { Component, OnInit } from '@angular/core';
import { PhoneProductShopService } from '../../../service/phone-product-shop.service';
import {Router} from '@angular/router';

@Component({
  selector: 'ngx-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  phoneProductShops;
  url;

  constructor(private router: Router,private phoneProductShopService:PhoneProductShopService) { }

  ngOnInit() {

    this.phoneProductShopService.getAll().subscribe(value => {
      this.phoneProductShops = value;
      console.log(value);
  });

  }


  redirect(id:string) {
     this.url = './pages/shoping/shopById/'.concat(id);
    this.router.navigate([this.url]);
  };


}
