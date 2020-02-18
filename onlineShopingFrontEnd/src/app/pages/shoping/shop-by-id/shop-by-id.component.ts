import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ShopService } from '../../../service/shop.service';


@Component({
  selector: 'ngx-shop-by-id',
  templateUrl: './shop-by-id.component.html',
  styleUrls: ['./shop-by-id.component.scss']
})
export class ShopByIdComponent implements OnInit {
  public id: string;
  shop;
  phoneProducts;

  constructor(private route: ActivatedRoute,private shopService:ShopService) {}

ngOnInit() {
   this.id = this.route.snapshot.paramMap.get('id');

   this.shopService.getById(this.id).subscribe(res=>{
      this.shop = res;
      this.phoneProducts = this.shop.phoneProductShops;
      console.log(res);
   })
   
}

}
