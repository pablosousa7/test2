import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {


  constructor(private http: HttpClient) { }

  getProducts() {
    return this.http.get("http://localhost:8080/api/products");
  }

  getProduct(id: number){
    return this.http.get("http://localhost:8080/api/product/" + id);
  }
}
