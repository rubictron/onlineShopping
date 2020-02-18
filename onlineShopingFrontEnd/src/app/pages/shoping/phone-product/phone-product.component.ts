import { Component, OnInit } from '@angular/core';
import { PhoneProductService } from '../../../service/phone-product.service';
  

@Component({
  selector: 'ngx-phone-product',
  templateUrl: './phone-product.component.html',
  styleUrls: ['./phone-product.component.scss']
})
export class PhoneProductComponent implements OnInit {

  phoneProducts;

  constructor(private phoneProductService:PhoneProductService) { }

  ngOnInit() {

    this.phoneProductService.getAll().subscribe(value => {
      this.phoneProducts = value;
      console.log(value);
  });

  }

}
