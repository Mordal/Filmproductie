import { Component, OnInit } from '@angular/core';
import { Film } from 'src/app/model/film';

@Component({
  selector: 'app-film',
  templateUrl: './film.component.html',
  styleUrls: ['./film.component.css']
})
export class FilmComponent implements OnInit {
  film!: Film;

  constructor(film: Film) { }

  ngOnInit(): void {
  }

}
