import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Order } from '../models/Order';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  cartProducts: any[] = [];
  
  private headerOptions: any = {
    observe: 'response',
    headers: new HttpHeaders({
      Authorization: 'Basic dWRhY2l0eTpwYXNzd29yZA=='
    })
};
  constructor(private http: HttpClient) { }

  getCartProducts() {
    return this.cartProducts;
  }

  addToCart(product: any, amount: any) {

    let index = this.cartProducts.map(product => product.name).indexOf(product.name);

    if (index != -1) {
      for (let existingProduct of this.cartProducts) {
        existingProduct.amount += parseInt(amount);
      }
    } else {
      this.cartProducts.push(product);
    }

    alert('Added to cart!');
  }

  clearCart() {
    this.cartProducts = [];
    return this.cartProducts;
  }

  updateCart(cart: any) {
    this.cartProducts = cart;

    return this.cartProducts;
  }

  submitOrder(order: any){
    return this.http.post("http://localhost:8080/api/order", order, this.headerOptions);
  }
}
