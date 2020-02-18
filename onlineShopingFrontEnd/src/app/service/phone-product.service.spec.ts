import { TestBed } from '@angular/core/testing';

import { PhoneProductService } from './phone-product.service';

describe('PhoneProductService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PhoneProductService = TestBed.get(PhoneProductService);
    expect(service).toBeTruthy();
  });
});
