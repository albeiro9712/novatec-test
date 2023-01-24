import { Student } from "./student.model";

export class ResponseGeneric {
  status?: string;
  userMessage?: string;
  developerMessage?: string;
  errorCode?: string;
  moreInfo?: string;
  data: Student[] = [];
  }