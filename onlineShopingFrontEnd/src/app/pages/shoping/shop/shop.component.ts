import { Component, OnInit ,ViewChild,TemplateRef } from '@angular/core';
import { ShopService } from '../../../service/shop.service';

@Component({
  selector: 'ngx-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.scss']
})
export class ShopComponent implements OnInit {
  
  shops;
  
  constructor(private shopService:ShopService) {
      }

  ngOnInit() {

    this.shopService.getAll().subscribe(value => {
        this.shops = value;
        console.log(value);
    });
  }


}
