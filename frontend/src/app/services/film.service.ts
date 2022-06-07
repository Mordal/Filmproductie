import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const filmStoreUrl = 'localhost';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  constructor(private http: HttpClient) { }

  searchForFilm(term: string) {
    return this.http.get<any>(`${filmStoreUrl}/${term}`);
  }
}
