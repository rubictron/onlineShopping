import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShopByIdComponent } from './shop-by-id.component';

describe('ShopByIdComponent', () => {
  let component: ShopByIdComponent;
  let fixture: ComponentFixture<ShopByIdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShopByIdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShopByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
