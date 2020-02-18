import { TestBed } from '@angular/core/testing';

import { PhoneProductShopService } from './phone-product-shop.service';

describe('PhoneProductShopService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PhoneProductShopService = TestBed.get(PhoneProductShopService);
    expect(service).toBeTruthy();
  });
});
