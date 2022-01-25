import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import {catchError} from 'rxjs/operators'; 
import { environment } from '../environments/environment';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  constructor(private http: HttpClient) { }

  
  getconvertedNumber(numberToConvert: number): Observable<Result> {
    return <Observable<Result>>  this.http.get(`${environment.apiUrl}/gbsu-ftb-lai/${numberToConvert}`).pipe(
      catchError((error, caught) => this.handleError(error, caught))
    );
  }


  private handleError<T>(error: any, caught: Observable<T>) {
    console.error('GbsuFtbLaiService::handleError', error);
    return throwError(error);
  }

}
