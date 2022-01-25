import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {


  subscription: Subscription = new Subscription();
  alreadyConverted = [] as Array<NumberConverted>;
  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }

  
  ngOnInit(): void {
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

  convertNumber(inputNumber: number): void {

    this.subscription = this.gbsuFtbLaiService.getconvertedNumber(inputNumber).subscribe(data => {
      const justconverted: NumberConverted = { numberToConvert: inputNumber, result: data.result };
      this.alreadyConverted.push(justconverted);
    });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
