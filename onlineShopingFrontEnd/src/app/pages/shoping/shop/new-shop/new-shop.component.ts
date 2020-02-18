import { Component, OnInit } from '@angular/core';
import { ShopService } from '../../../../service/shop.service';
import {NgForm} from '@angular/forms';


@Component({
  selector: 'ngx-new-shop',
  templateUrl: './new-shop.component.html',
  styleUrls: ['./new-shop.component.scss']
})
export class NewShopComponent implements OnInit {

  constructor(public shopService:ShopService ) { }

  ngOnInit() {
  }

  
  
  onSubmit(f: NgForm) {
    console.log(f.value);  // { first: '', last: '' }
    console.log(f.valid);  // false
  }


}
