import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const filmStoreUrl = 'localhost';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  constructor(private http: HttpClient) { }

  getFilmById(id: number) {
    return this.http.get<any>(`${filmStoreUrl}/${id}`);
  }
}
