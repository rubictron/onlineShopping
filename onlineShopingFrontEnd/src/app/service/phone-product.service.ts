import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from './../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PhoneProductService {

  constructor(private httpClient: HttpClient) { }

  public getAll(){
    return this.httpClient.get(environment.apiEndPoint+"/PhoneProducts/getAll");
  }
}
