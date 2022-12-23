import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private headerOptions: any = {
    observe: 'response',
    headers: new HttpHeaders({
      'Authorization': 'Basic dWRhY2l0eTpwYXNzd29yZA=='
    })
};

  constructor(private http: HttpClient) { }

  getProducts(): any {
    return this.http.get("http://localhost:8080/api/products", this.headerOptions);
  }

  getProduct(id: number){
    return this.http.get("http://localhost:8080/api/product/" + id, this.headerOptions);
  }
}
